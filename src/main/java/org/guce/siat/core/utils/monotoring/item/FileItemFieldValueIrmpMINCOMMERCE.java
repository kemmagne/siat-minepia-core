/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guce.siat.core.utils.monotoring.item;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemField;
import org.guce.siat.common.model.FileItemFieldValue;

/**
 *
 * @author yenke
 */
public class FileItemFieldValueIrmpMINCOMMERCE {
    
    public static FileItemFieldValue generateFileItemFieldValueIrmpMINCOMMERCE(final FileItem fileItem, final FileItemField fileItemField,
            org.guce.siat.jaxb.monitoring.IRPM_MINCOMMERCE.DOCUMENT.CONTENT.MARCHANDISES.MARCHANDISE marchandise) {
        final FileItemFieldValue fileItemFieldValue = new FileItemFieldValue();
        fileItemFieldValue.setFileItem(fileItem);
        fileItemFieldValue.setFileItemField(fileItemField);
        switch (fileItemField.getCode()){
            case "MARQUE": {
                if (marchandise.getMARQUE() != null){
                    fileItemFieldValue.setValue(marchandise.getMARQUE());
                }
                break;
            }
            case "CATEGORIE": {
                if (marchandise.getCATEGORIE() != null) {
                    fileItemFieldValue.setValue(marchandise.getCATEGORIE());
                }
                break;
            }
            case "PRESENTATION": {
                if (marchandise.getPRESENTATION() != null) {
                    fileItemFieldValue.setValue(marchandise.getPRESENTATION());
                }
                break;
            }
            case "UNITE" : {
                if (marchandise.getUNITE() != null) {
                    fileItemFieldValue.setValue(marchandise.getUNITE());
                }
                break;
            }
            case "NOM_COMMERCIAL": {
                if (marchandise.getNOMCOMMERCIAL() != null) {
                    fileItemFieldValue.setValue(marchandise.getNOMCOMMERCIAL());
                }
                break;
            }
            case "NOM_SCIENTIFIQUE": {
                if (marchandise.getNOMSCIENTIFIQUE() != null) {
                    fileItemFieldValue.setValue(marchandise.getNOMSCIENTIFIQUE());
                }
                break;
            }
            case "POIDS" : {
                if (marchandise.getPOIDS() != null) {
                    fileItemFieldValue.setValue(marchandise.getPOIDS());
                }
                break;
            }
            case "VOLUMNE" : {
                if (marchandise.getVOLUME() != null){
                    fileItemFieldValue.setValue(marchandise.getVOLUME());
                }
                break;
            }
            case "SPECIFICATION_TECHNIQUE": {
                if (marchandise.getSPECIFICATIONTECHNIQUE() != null){
                    fileItemFieldValue.setValue(marchandise.getSPECIFICATIONTECHNIQUE());
                }
                break;
            }
            case "MODE_EMBALLAGE": {
                if (marchandise.getMODEEMBALLAGE() != null) {
                    fileItemFieldValue.setValue(marchandise.getMODEEMBALLAGE());
                }
                break;
            }
            case "VALEUR_CAF": {
                if (marchandise.getVALEURCAF() != null){
                    fileItemFieldValue.setValue(marchandise.getVALEURCAF());
                }
                break;
            }
            case "LIEU_ESSAI": {
                if (marchandise.getLIEUESSAI() != null) {
                    fileItemFieldValue.setValue(marchandise.getLIEUESSAI());
                }
                break;
            }
            case "PAYS_ORIGINE_CODE_PAYS": {
                if (marchandise.getPAYSORIGINE() != null && marchandise.getPAYSORIGINE().getCODEPAYS() != null){
                    fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getCODEPAYS());
                }
                break;
            }
            case "PAYS_ORIGINE_NOM_PAYS": {
                if (marchandise.getPAYSORIGINE() != null && marchandise.getPAYSORIGINE().getNOMPAYS() != null) {
                    fileItemFieldValue.setValue(marchandise.getPAYSORIGINE().getNOMPAYS());
                }
                break;
            }
        }
        return fileItemFieldValue;
    }
}
