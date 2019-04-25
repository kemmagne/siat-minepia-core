package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.File;

@Entity
@Table(
   name = "BSB_WOOD_SPEC"
)
public class WoodSpecification extends AbstractModel implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(
      optional = false
   )
   @Column(
      name = "ID"
   )
   @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "WOOD_SPEC_SEQ"
   )
   @SequenceGenerator(
      name = "WOOD_SPEC_SEQ",
      sequenceName = "WOOD_SPEC_SEQ",
      allocationSize = 1
   )
   private Long id;
   @Column(
      name = "SPEC_LINE_NUMBER"
   )
   private Integer lineNumber;
   @Column(
      name = "SPEC_WOOD_SPECIES",
      length = 35
   )
   private String woodSpecies;
   @Column(
      name = "NUM_MARQUE_GRUME",
      length = 50
   )
   private String numMarqueGrume;
    @Column(name = "NUM_COLIS", length = 17)
    private String numColis;
    @Column(name = "NBRE_PIECES", precision = 10)
    private Integer nbrePieces;
   @Column(
      name = "LONGUEUR_GRUME",
      precision = 5,
      scale = 3
   )
   private BigDecimal longueurGrume;
   
    @Column(name = "LARGEUR", precision = 10)
    private BigDecimal largeur;
    
    @Column(name = "EPAISSEUR", precision = 10)
    private Integer epaisseur;
    
   @Column(
      name = "DIAM_GROS_BOUT",
      precision = 5
   )
   private Integer diamGrosBout;
   @Column(
      name = "DIAM_PETIT_BOUT",
      precision = 5
   )
   private Integer diamPetitBout;
   @Column(
      name = "DIAM_MOYEN",
      precision = 5
   )
   private Integer diamMoyen;
   @Column(
      name = "VOLUME",
      precision = 5,
      scale = 3
   )
   private BigDecimal volume;
   @Column(
      name = "FOURNISSEUR",
      length = 50
   )
   private String fournisseur;
   @Column(
      name = "OBSERVATIONS",
      length = 255
   )
   private String observations;
   @JoinColumn(
      name = "FILE_ID",
      referencedColumnName = "ID"
   )
   @ManyToOne
   private File file;


   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Integer getLineNumber() {
      return this.lineNumber;
   }

   public void setLineNumber(Integer lineNumber) {
      this.lineNumber = lineNumber;
   }

   public String getWoodSpecies() {
      return this.woodSpecies;
   }

   public void setWoodSpecies(String woodSpecies) {
      this.woodSpecies = woodSpecies;
   }

   public String getNumMarqueGrume() {
      return this.numMarqueGrume;
   }

   public void setNumMarqueGrume(String numMarqueGrume) {
      this.numMarqueGrume = numMarqueGrume;
   }

    public String getNumColis() {
        return numColis;
    }

    public void setNumColis(String numColis) {
        this.numColis = numColis;
    }

    public Integer getNbrePieces() {
        return nbrePieces;
    }

    public void setNbrePieces(Integer nbrePieces) {
        this.nbrePieces = nbrePieces;
    }

   public BigDecimal getLongueurGrume() {
      return this.longueurGrume;
   }

   public void setLongueurGrume(BigDecimal longueurGrume) {
      this.longueurGrume = longueurGrume;
   }

    public BigDecimal getLargeur() {
        return largeur;
    }

    public void setLargeur(BigDecimal largeur) {
        this.largeur = largeur;
    }

    public Integer getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(Integer epaisseur) {
        this.epaisseur = epaisseur;
    }

   public Integer getDiamGrosBout() {
      return this.diamGrosBout;
   }

   public void setDiamGrosBout(Integer diamGrosBout) {
      this.diamGrosBout = diamGrosBout;
   }

   public Integer getDiamPetitBout() {
      return this.diamPetitBout;
   }

   public void setDiamPetitBout(Integer diamPetitBout) {
      this.diamPetitBout = diamPetitBout;
   }

   public Integer getDiamMoyen() {
      return this.diamMoyen;
   }

   public void setDiamMoyen(Integer diamMoyen) {
      this.diamMoyen = diamMoyen;
   }

   public BigDecimal getVolume() {
      return this.volume;
   }

   public void setVolume(BigDecimal volume) {
      this.volume = volume;
   }

   public String getFournisseur() {
      return this.fournisseur;
   }

   public void setFournisseur(String fournisseur) {
      this.fournisseur = fournisseur;
   }

   public String getObservations() {
      return this.observations;
   }

   public void setObservations(String observations) {
      this.observations = observations;
   }

   public File getFile() {
      return this.file;
   }

   public void setFile(File file) {
      this.file = file;
   }

   public int hashCode() {
      byte hash = 0;
      int hash1 = hash + (this.id != null?this.id.hashCode():0);
      return hash1;
   }

   public boolean equals(Object object) {
      if(!(object instanceof WoodSpecification)) {
         return false;
      } else {
         WoodSpecification other = (WoodSpecification)object;
         return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
      }
   }

   public String toString() {
      return "org.guce.siat.core.ct.model.WoodSpecification[ id=" + this.id + " ]";
   }
}
