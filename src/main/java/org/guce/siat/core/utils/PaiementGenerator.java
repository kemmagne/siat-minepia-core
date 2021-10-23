package org.guce.siat.core.utils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

import org.guce.siat.common.model.Entity;
import org.guce.siat.common.utils.ebms.EbmsUtility;
import org.guce.siat.common.utils.ebms.UtilitiesException;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.core.ct.model.PaymentData;
import org.guce.siat.core.ct.model.PaymentItemFlow;
import org.guce.siat.utility.jaxb.common.PAIEMENT;
import org.guce.siat.utility.jaxb.common.PAIEMENT.BENEFICIAIRE;
import org.guce.siat.utility.jaxb.common.PAIEMENT.CHARGEUR;
import org.guce.siat.utility.jaxb.common.PAIEMENT.ENCAISSEMENT;
import org.guce.siat.utility.jaxb.common.PAIEMENT.FACTURE;
import org.guce.siat.utility.jaxb.common.PAIEMENT.FACTURE.DETAILFACTURES;
import org.guce.siat.utility.jaxb.common.PAIEMENT.FACTURE.DETAILFACTURES.DETAILFACTURE;
import org.guce.siat.utility.jaxb.common.PAIEMENT.PARTIEVERSANTE;


/**
 * The Class PaiementGenerator.
 */
public final class PaiementGenerator
{

	/**
	 * Instantiates a new paiement generator.
	 */
	private PaiementGenerator()
	{
	}


	/**
	 * Generate paiement.
	 *
	 * @param paymentData
	 *           the payment data
	 * @param flowCode
	 *           the flow code
	 * @return the paiement
	 */
	public static PAIEMENT generatePaiement(final PaymentData paymentData, final String flowCode)
	{
		final PAIEMENT paiement = new PAIEMENT();
		final BENEFICIAIRE beneficiaire = new BENEFICIAIRE();
		final CHARGEUR chargeur = new CHARGEUR();
		PARTIEVERSANTE partieVersante = new PARTIEVERSANTE();
		if (paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile().getClient() != null)
		{
			partieVersante.setNUMEROCONTRIBUABLE(paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile()
					.getClient().getNumContribuable());
			partieVersante.setRAISONSOCIALE(paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile()
					.getClient().getCompanyName());
                        chargeur.setNUMEROCONTRIBUABLE(paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile()
					.getClient().getNumContribuable());
			chargeur.setRAISONSOCIALE(paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile()
					.getClient().getCompanyName());
			//	partieVersante.setNOM(paymentData.getPaymentItemFlowList().get(0).getItemFlow().getSender().getFirstName());
			//	partieVersante.setLIEU(paymentData.getPaymentItemFlowList().get(0).getItemFlow().getSender().getAdministration()
			//		.getLabelFr());
			//signataire.set
		}
		final org.guce.siat.utility.jaxb.common.PAIEMENT.SIGNATAIRE signataire = new org.guce.siat.utility.jaxb.common.PAIEMENT.SIGNATAIRE();
		if (Arrays.asList(FlowCode.FL_AP_160.name(), FlowCode.FL_AP_161.name(), FlowCode.FL_AP_162.name(),
				FlowCode.FL_AP_163.name(), FlowCode.FL_AP_164.name(), FlowCode.FL_AP_165.name(), FlowCode.FL_CT_92.name(),
				FlowCode.FL_AP_167.name(), FlowCode.FL_AP_193.name(), FlowCode.FL_AP_194.name()).contains(
				flowCode))
		{
			paiement.setFACTURE(new FACTURE());

			paiement.getFACTURE().setAUTREMONTANT(
					paymentData.getAutreMontant() != null ? paymentData.getAutreMontant().toString() : null);
			paiement.getFACTURE().setMONTANTHT(paymentData.getMontantHt() != null ? paymentData.getMontantHt().toString() : null);
			paiement.getFACTURE().setMONTANTTVA(paymentData.getMontantTva() != null ? paymentData.getMontantTva().toString() : null);
                        final Long montantTTC = (paymentData.getMontantTva() != null ? paymentData.getMontantTva() : 0L)
						+ (paymentData.getMontantHt() != null ? paymentData.getMontantHt() : 0L)
                                                + (paymentData.getAutreMontant()!= null ? paymentData.getAutreMontant(): 0L);
                        paiement.getFACTURE().setMONTANTTTC(montantTTC.toString());
			paiement.getFACTURE().setDETAILFACTURES(new DETAILFACTURES());
			paiement.getFACTURE().setREFERENCEFACTURE(paymentData.getRefFacture());
			for (final PaymentItemFlow elmt : paymentData.getPaymentItemFlowList())
			{
				final DETAILFACTURE detailFacture = new DETAILFACTURE();
				detailFacture.setLIBELLEARTICLE(elmt.getItemFlow().getFileItem().getNsh() != null ? elmt.getItemFlow().getFileItem()
						.getNsh().getGoodsItemDesc() : "");
				detailFacture.setNUMEROLIGNE(elmt.getItemFlow().getFileItem().getLineNumber() != null ? elmt.getItemFlow()
						.getFileItem().getLineNumber().toString() : null);
				detailFacture.setMONTANTHT(elmt.getMontantHt() != null ? elmt.getMontantHt().toString() : null);
				detailFacture.setMONTANTTVA(elmt.getMontantTva() != null ? elmt.getMontantTva().toString() : null);
				final Long ttc = (elmt.getMontantTva() != null ? elmt.getMontantTva() : 0L)
						+ (elmt.getMontantHt() != null ? elmt.getMontantHt() : 0L);
				detailFacture.setMONTANTTTC(ttc.toString());
				detailFacture.setCODEARTICLE(elmt.getItemFlow().getFileItem().getNsh() != null ? elmt.getItemFlow().getFileItem()
						.getNsh().getGoodsItemCode() : "");
				paiement.getFACTURE().getDETAILFACTURES().getDETAILFACTURE().add(detailFacture);
			}
			final Entity bureau = paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile().getBureau();
			beneficiaire.setCODE(bureau.getService().getSubDepartment().getOrganism().getMinistry().getLabelFr());
			beneficiaire.setLIBELLE(bureau.getService().getSubDepartment().getOrganism().getMinistry().getLabelFr());

		}
		else
		{
			ENCAISSEMENT encaissement = null;
			try
			{
				//Ecaissement
				encaissement = new ENCAISSEMENT();
				encaissement.setNUMERORECU(paymentData.getNumRecu());
				encaissement.setNATURE(paymentData.getNatureEncaissement());
				encaissement.setDATEENCAISSEMENT(EbmsUtility.date2UTC(Calendar.getInstance().getTime(), TimeZone.getDefault()));
				encaissement.setMONTANT(paymentData.getMontantEncaissement() != null ? paymentData.getMontantEncaissement()
						.toString() : null);
				encaissement.setOBSERVATIONS(paymentData.getObservation());

				final Entity bureau = paymentData.getPaymentItemFlowList().get(0).getItemFlow().getFileItem().getFile().getBureau();
				beneficiaire.setCODE(bureau.getService().getSubDepartment().getOrganism().getMinistry().getLabelFr());
				beneficiaire.setLIBELLE(bureau.getService().getSubDepartment().getOrganism().getMinistry().getLabelFr());


			}
			catch (final UtilitiesException e)
			{
				e.printStackTrace();
			}
			paiement.setENCAISSEMENT(encaissement);
			signataire.setNOM(paymentData.getNomSignature());
			signataire.setLIEU(paymentData.getLieuSignature());
			//signataire.set
		}
		paiement.setPARTIEVERSANTE(partieVersante);
		paiement.setBENEFICIAIRE(beneficiaire);
		paiement.setCHARGEUR(chargeur);
		paiement.setSIGNATAIRE(signataire);
		return paiement;
	}

}
