/*==============================================================*/
/* Table : REP_MODE_TRANSPORT = MODE DE TRANSPORT               */
/*==============================================================*/
INSERT INTO REP_MODE_TRANSPORT ( MODE_TRANSPORT_CODE, MODE_TRANSPORT_NAME, MODE_TRANSPORT_NAME_EN)VALUES( 1, 'Le Transport Aérien ', 'Air Transport');
INSERT INTO REP_MODE_TRANSPORT ( MODE_TRANSPORT_CODE, MODE_TRANSPORT_NAME, MODE_TRANSPORT_NAME_EN)VALUES( 2, 'Le Transport par voie des eaux (maritime et fluvial)', 'Transport by water channel (sea and river)');
INSERT INTO REP_MODE_TRANSPORT ( MODE_TRANSPORT_CODE, MODE_TRANSPORT_NAME, MODE_TRANSPORT_NAME_EN)VALUES( 3, 'Le Transport Routier ', 'Road Transport');
INSERT INTO REP_MODE_TRANSPORT ( MODE_TRANSPORT_CODE, MODE_TRANSPORT_NAME, MODE_TRANSPORT_NAME_EN)VALUES( 4, 'Le Transport Ferroviaire ', 'The Rail Transport');
COMMIT;

/*==============================================================*/
/* Table : REP_TYPES_MOYEN_TRANSPORT = MOYEN DE TRANSPORT       */
/*==============================================================*/
INSERT INTO REP_TYPES_MOYEN_TRANSPORT ( MEAN_TRANSPORT_CODE,  MEAN_TRANSPORT_NAME,  MEAN_TRANSPORT_NAME_EN, MEAN_TRANSPORT_PARENT_CODE, MODE_TRANSPORT_CODE) VALUES('TA', 'Le Transport Aérien ', 'Air Transport', 'Air Transport', 1);
INSERT INTO REP_TYPES_MOYEN_TRANSPORT ( MEAN_TRANSPORT_CODE,  MEAN_TRANSPORT_NAME,  MEAN_TRANSPORT_NAME_EN, MEAN_TRANSPORT_PARENT_CODE, MODE_TRANSPORT_CODE) VALUES('TM', 'Le Transport par voie des eaux (maritime et fluvial)', 'Transport by water channel (sea and river)', 'Transport by water channel (sea and river)', 2);
INSERT INTO REP_TYPES_MOYEN_TRANSPORT ( MEAN_TRANSPORT_CODE,  MEAN_TRANSPORT_NAME,  MEAN_TRANSPORT_NAME_EN, MEAN_TRANSPORT_PARENT_CODE, MODE_TRANSPORT_CODE) VALUES('TR', 'Le Transport Routier ', 'Road Transport', 'Road Transport', 3);
INSERT INTO REP_TYPES_MOYEN_TRANSPORT ( MEAN_TRANSPORT_CODE,  MEAN_TRANSPORT_NAME,  MEAN_TRANSPORT_NAME_EN, MEAN_TRANSPORT_PARENT_CODE, MODE_TRANSPORT_CODE) VALUES( 'TF', 'Le Transport Ferroviaire ', 'The Rail Transport', 'The Rail Transport', 4);
COMMIT;

/*==============================================================*/
/* Table : REP_UNLOCODE = Port                                  */
/*==============================================================*/
INSERT INTO REP_UNLOCODE ( LOCATION_CODE, LOCATION_COORDINATES, LOCATION_DATE, LOCATION_FUNCTION_CODE, LOCATION_IATA_CODE,LOCATION_NAME, LOCATION_NAME_EN, LOCATION_STATUT, SUBDIVISION_CODE, COUNTRY_ID) VALUES( 'RADTN', 'Rades Port', TO_DATE('2015-01-30','YYYY-MM-DD'), 'RADES LOCATION CODE 1122', 'RADES LOCATION IATA CODE 2525', 'Port Maritime International de Rades', 'International Port Rades', 'Ouvert', 'SUBDIVISION CODE SUB01', 'TN');
INSERT INTO REP_UNLOCODE ( LOCATION_CODE, LOCATION_COORDINATES, LOCATION_DATE, LOCATION_FUNCTION_CODE, LOCATION_IATA_CODE, LOCATION_NAME, LOCATION_NAME_EN, LOCATION_STATUT, SUBDIVISION_CODE, COUNTRY_ID ) VALUES( 'BELUK', 'Port de Belfast', TO_DATE('2015-01-30','YYYY-MM-DD'), 'Belfast LOCATION CODE 1122', 'Belfast LOCATION IATA CODE 2525', 'Port Maritime International de Belfast', 'International Port of Belfast', 'Ouvert', 'SUBDIVISION CODE SUB01', 'GB');
COMMIT;

/*==============================================================*/
/* Table : COMPANY = COMPANY                                    */
/*==============================================================*/
INSERT INTO COMPANY (ID, CITY, COMPANY_NAME, EMAIL, FAX, FIRST_ADDRESS, MOBILE, NAME, NUM_CONTRIBUABLE, PHONE, POSTALCODE, RECIPIENT_FIRST_NAME, SECOND_ADDRESS, COUNTRY_ID, WEB_SITE, COMPANY_TYPE) VALUES ( COMPANY_SEQ.nextVal, 'Tunis', 'Tunise Transit', 'exemple@exemple.com', '70707070', '16 Rue la liberté TUNIS', '70707070', '', 'CONTRIBUABLE001', '71700700', '1000', 'recipient first name', null, 'TN', 'http://wwww.', 'DECLARANT');
INSERT INTO COMPANY (ID, CITY, COMPANY_NAME, EMAIL, FAX, FIRST_ADDRESS, MOBILE, NAME, NUM_CONTRIBUABLE, PHONE, POSTALCODE, RECIPIENT_FIRST_NAME, SECOND_ADDRESS, COUNTRY_ID, WEB_SITE, COMPANY_TYPE) VALUES ( COMPANY_SEQ.nextVal, 'Tunis', 'Belfast TRANSIT', 'exemple@exemple.com', '70707070', '16 Rue la liberté TUNIS', '70707070', '', 'CONTRIBUABLE001', '71700700', '1000', 'recipient first name', null, 'TN', 'http://wwww.', 'DESTINATAIRE');
INSERT INTO COMPANY (ID, CITY, COMPANY_NAME, EMAIL, FAX, FIRST_ADDRESS, MOBILE, NAME, NUM_CONTRIBUABLE, PHONE, POSTALCODE, RECIPIENT_FIRST_NAME, SECOND_ADDRESS, COUNTRY_ID, WEB_SITE, COMPANY_TYPE) VALUES ( COMPANY_SEQ.nextVal, 'Tunis', 'Exllence TRANSIT', 'exemple@exemple.com', '70707070', '16 Rue la liberté TUNIS', '70707070', '', 'CONTRIBUABLE001', '71700700', '1000', 'recipient first name', null, 'TN', 'http://wwww.', 'TRANSITAIRE');
COMMIT;


/*==============================================================*/
/* Table : REP_TYPES_PACKAGE = Packaging                        */
/*==============================================================*/
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Conteneurs de fret intermodaux', 'Conteneurs de fret intermodaux', 'Intermodal freight containers');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'boîte en carton ondulé', 'boîte en carton ondulé', 'Corrugated box');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'boîte en bois', 'boîte en bois', 'Wooden box');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'caisse', 'caisse', 'Crate');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Conteneur dexpédition vrac', 'Conteneur dexpédition vrac', 'Intermediate bulk shipping container');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Flexible Intermediate Bulk Container', 'Flexible Intermediate Bulk Container', 'Flexible Intermediate Bulk Container');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'boîte en vrac', 'boîte en vrac', 'Bulk box');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'tambour', 'tambour', 'Drum');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Des conteneurs dexpédition isolés', 'Des conteneurs dexpédition isolés', 'Insulated shipping containers');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'seau', 'seau', 'Pail');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Dispositif de charge d unité', 'Dispositif de charge d unité', 'Unit load device');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Certains conteneurs spécialisés d expédition', 'Certains conteneurs spécialisés d expédition', 'Specialized shipping containers');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Transit et Flight Case', 'Transit et Flight Case', 'Transit and Flight Case');
INSERT INTO REP_TYPES_PACKAGE( PACKAGE_TYPE_CODE, PACKAGE_TYPE_DESC, PACKAGE_TYPE_DESC_EN) VALUES ( 'Road Case', 'Road Case', 'Road Case');
COMMIT;

/*==============================================================*/
/* Table : REP_UNIT_MEASURE = Unite de Mesure                   */
/*==============================================================*/
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 'm', 'Metre', 'Length', 'Metre', '1', 'Length');
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 'kg', 'Kilogram', 'Mass', 'Kilogram', '1', 'Mass');
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 's', 'Second', 'Time', 'Second', '1', 'Time');
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 'A', 'Ampere', 'Electric current', 'Ampere', '1', 'Electric current');
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 'K', 'Kelvin', 'Thermodynamic temperature', 'Kelvin', '1', 'Thermodynamic temperature');
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 'mol', 'Amount of substance', 'Mole', 'Mole', '1', 'Amount of substance');
INSERT INTO REP_UNIT_MEASURE ( UNIT_MEASURE_CODE, UNIT_MEASURE_CATEGORY, UNIT_MEASURE_NAME, UNIT_MEASURE_NAME_EN, UNIT_MEASURE_QUANTITY, UNIT_MEASURE_SECTOR) VALUES ( 'cd', 'Luminous intensity', 'Candela', 'Candela', '1', 'Luminous intensity');
COMMIT;

/*==============================================================*/
/* Table : REP_TYPE_EQUIPMENT                                   */
/*==============================================================*/
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('vcc','Conteneur aéré fermé','Ventilated container closed');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('pbcoscs','conteneur type plate-forme à parois latérales ouvertes et superstructure complète','Platform based container open sided with complete superstructure');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('pbcos','conteneur type plate-forme à parois latérales ouvertes','Platform based container open sided');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('otp','conteneur à toit ouvert','open top container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('cpbisfe','conteneur type plate-forme à superstructure incomplète et extrémités fixes','container platform based on incomplete superstructure and fixed ends');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('cpisfe','conteneur plate-forme à superstructure incomplète et extrémités repliables','container platform with incomplete superstructure and folding ends');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('cp','conteneur plate-forme','container platform');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('thc','conteneur à caractéristiques thermiques','Thermal container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('ic','conteneur isotherme','insulated container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('rc','conteneur réfrigéré (à réfrigérant renouvelable)','Refrigerated container (expendable refrigerant)');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('mrc','conteneur réfrigéré mécaniquement','mechanically refrigerated container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('hc','conteneur chauffé','heated container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('rhc','conteneur réfrigéré et chauffé','Refrigerated and heated container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('tc','conteneur-citerne','tank-container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('cdb','conteneur pour marchandises solides en vrac','container for dry bulk');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('sc','conteneur spécialisé','specialized container');
INSERT INTO REP_TYPE_EQUIPMENT (EQUIPMENT_TYPE_CODE,EQUIPMENT_TYPE_NAME,EQUIPMENT_TYPE_NAME_EN) VALUES ('ac','conteneur aérien','air container');
COMMIT;

/*==============================================================*/
/* Table : HOLIDAY                                              */
/*==============================================================*/
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (1, to_date('2015-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Nouvel an', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (2, to_date('2015-01-14 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Fête de la Révolution et de la Jeunesse', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (3, to_date('2015-03-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Fête de l Indépendance', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (4, to_date('2015-04-09 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Journée des Martyrs', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (5, to_date('2015-05-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Fête du Travail', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (6, to_date('2015-07-25 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Fête de la République', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (7, to_date('2015-08-13 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Fête de la Femme et de la Famille', 0);
INSERT INTO HOLIDAY(ID, HOLIDAY_DATE, LABEL, DELETED) VALUES (8, to_date('2015-10-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Fête de l Évacuation', 0);
COMMIT;

/*==============================================================*/
/* Table : FILES                                                */
/*==============================================================*/
INSERT INTO FILES (ID,CREATED_DATE,NUMERO_DEMANDE,REFERENCE_GUCE,REFERENCE_SIAT, ASSIGNED_USER_ID,CLIENT_ID,FILE_TYPE_ID, SERVICE_ID) VALUES (1, TO_DATE('2015-01-30','YYYY-MM-DD'),'100501','100501','100501',null, 1, 1, 30);
INSERT INTO FILES (ID,CREATED_DATE,NUMERO_DEMANDE,REFERENCE_GUCE,REFERENCE_SIAT, ASSIGNED_USER_ID,CLIENT_ID,FILE_TYPE_ID, SERVICE_ID) VALUES (2, TO_DATE('2015-01-30','YYYY-MM-DD'),'100502','100502','100502',null, 1, 1, 30);
INSERT INTO FILES (ID,CREATED_DATE,NUMERO_DEMANDE,REFERENCE_GUCE,REFERENCE_SIAT, ASSIGNED_USER_ID,CLIENT_ID,FILE_TYPE_ID, SERVICE_ID) VALUES (3, TO_DATE('2015-01-30','YYYY-MM-DD'),'100503','100503','100503',null, 1, 1, 30);
INSERT INTO FILES (ID,CREATED_DATE,NUMERO_DEMANDE,REFERENCE_GUCE,REFERENCE_SIAT, ASSIGNED_USER_ID,CLIENT_ID,FILE_TYPE_ID, SERVICE_ID) VALUES (4, TO_DATE('2015-01-30','YYYY-MM-DD'),'100504','100504','100504',null, 1, 1, 30);


/*==============================================================*/
/* Table : FILE_ITEM = FILE_ITEM with ITEM_FLOW                 */
/*==============================================================*/


/* FILE_ITEM 1/2 with FILE_ID = 1 */
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID,  STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (1, 1,1, '18069031004', 2,10,'0');
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID,  STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (2, 1,1, '19059045922', 2,11,'0');

INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (1, 1, 1, 1, TO_DATE('2011-09-05','YYYY-MM-DD'), 1, 1);
INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (2, 2, 1, 1, TO_DATE('2011-09-05','YYYY-MM-DD'), 1, 1);

/* FILE_ITEM 3/4 with FILE_ID = 2 */
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID, STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (3, 1, 2, '18069031004', 2,10,'0');
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID, STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (4, 1, 2, '19059045922', 2,11,'0');

INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (3, 3, 1, 1, TO_DATE('2015-02-01','YYYY-MM-DD'), 1, 1);
INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (4, 4, 1, 1, TO_DATE('2015-02-01','YYYY-MM-DD'), 1, 1);


/* FILE_ITEM 5/6 with FILE_ID = 3 */
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID, STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (5, 1, 3, '18069031004', 2,10,'0');
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID, STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (6, 1, 3, '19059045922', 2,11,'0');

INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (5, 5, 1, 1, TO_DATE('2015-02-01','YYYY-MM-DD'), 1, 1);
INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (6, 6, 1, 1, TO_DATE('2015-02-01','YYYY-MM-DD'), 1, 1);


/* FILE_ITEM 7/8 with FILE_ID = 4 */
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID, STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (7, 1, 4, '18069031004', 2,10,'0');
INSERT INTO FILE_ITEM (ID, LINE_NUMBER, FILE_ID, NSH_ID, STEP_ID, SUBFAMILY_ID, DRAFT) VALUES (8, 1, 4, '19059045922', 2,11,'0');

INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (7, 7, 1, 1, TO_DATE('2015-02-01','YYYY-MM-DD'), 1, 0);
INSERT INTO ITEM_FLOW (ID, FILE_ITEM_ID, FLOW_ID, SENDER_ID, CREATED, UNREAD , SENT) VALUES (8, 8, 1, 1, TO_DATE('2015-02-01','YYYY-MM-DD'), 1, 0);

COMMIT;


/*=============================================================================*/
/* Table : USER_AUTHORITY For  MINEPIA-AG-AR MINEPIA-AG-CT1  MINEPIA-AG-INSP   */                        
/*=============================================================================*/
INSERT INTO USER_AUTHORITY( ID, AUTHORITY_ID, USER_ID) VALUES( 134, 6, 122);
INSERT INTO USER_AUTHORITY( ID, AUTHORITY_ID, USER_ID) VALUES( 135, 13, 41);
COMMIT;

/*=========================================================================================*/
/* Table : USER_AUTHORIRTY_FILE_TYPE For  MINEPIA-AG-AR MINEPIA-AG-CT1  MINEPIA-AG-INSP    */                        
/*=========================================================================================*/
INSERT INTO USER_AUTHORIRTY_FILE_TYPE ( FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES ( 1, 103);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE ( FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES ( 1, 134);
INSERT INTO USER_AUTHORIRTY_FILE_TYPE ( FILE_TYPE_ID, USER_AUTHORITY_ID ) VALUES ( 1, 135);
COMMIT;

/*==============================================================*/
/* Table : ATTACHMENT                                           */
/*==============================================================*/
INSERT INTO ATTACHMENT (ID, ALFRESCO_ID, DOCUMENT_DATE, DOCUMENT_NAME, DOCUMENT_NUMBER, ATTACHMENT_TYPE, FILE_ID) VALUES (1,'7481899d-95f8-48d8-bcac-17865633ab78', to_date('2011-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Certificat', 1, 'CERTIFICAT_LIBRE_VENTE', 1);
INSERT INTO ATTACHMENT (ID, ALFRESCO_ID, DOCUMENT_DATE, DOCUMENT_NAME, DOCUMENT_NUMBER, ATTACHMENT_TYPE, FILE_ID) VALUES (2, '266c5129-7ffe-4ef4-9775-071c7b81069c', to_date('2011-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'Facture', 2, 'POLICE_TECHNIQUE', 1);
COMMIT ;

/*==============================================================*/
/* Table : RECOMMANDATION                                       */
/*==============================================================*/
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 1, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation value 1',1,null,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 2, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation value 2',1,null,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 3, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation value 3',1,null,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 4, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation value 4',1,null,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 5, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Article 1',null,1,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 6, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Article 1',null,1,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 7, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Article 2',null,2,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 8, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Article 2',null,2,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 9, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Profil 1',null,null,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 10, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Profil 2',null,null,11);
INSERT INTO RECOMMANDATION(ID, CREATED, VALUE, FILE_ID, FILE_ITEM_ID, SUPERVISOR_ID) VALUES ( 11, TO_TIMESTAMP('2011-01-01 00:00:00.000','YYYY-MM-DD HH24:MI:SS.FF'), 'Recommandation par Profil 3',null,null,11);
COMMIT ;
 

/*==============================================================*/
/* Table : CAR					                                     */
/*==============================================================*/
INSERT INTO CAR(ID, DELETED, ENABLED, MODEL, SERIAL_NUMBER, ORGANISM_ID)VALUES(1, 0, 1, 'mazda', '100 TU 70', 2);
INSERT INTO CAR(ID, DELETED, ENABLED, MODEL, SERIAL_NUMBER, ORGANISM_ID)VALUES(2, 0, 1, 'mercedes', '150 TU 60', 3);
INSERT INTO CAR(ID, DELETED, ENABLED, MODEL, SERIAL_NUMBER, ORGANISM_ID)VALUES(3, 0, 1, 'M5', '122 TU 99', 3);
INSERT INTO CAR(ID, DELETED, ENABLED, MODEL, SERIAL_NUMBER, ORGANISM_ID)VALUES(4, 0, 1, 'Citroen', '144 TU 789', 28);
INSERT INTO CAR(ID, DELETED, ENABLED, MODEL, SERIAL_NUMBER, ORGANISM_ID)VALUES(5, 0, 1, 'peugeot', '89 TU 34', 28);
COMMIT;

/*==============================================================*/
/* Table : APPOINTMENT                                           */
/*==============================================================*/
INSERT INTO APPOINTMENT (ID, BEGIN_TIME, END_TIME, HISTORY, INSPECTION_ON_DOCK, OBSERVATIONS,DELETED, CAR_ID, CONTROLLER_ID) VALUES (1,NULL,NULL,NULL,NULL,NULL,0,4,41);

COMMIT;

/*===============================================================*/
/* Table : HISOTRY                                               */
/*===============================================================*/
INSERT INTO HISTORY (ID,ACTION,AUDITDATE,IDMODEL,IPADDRESS,MACADDRESS,MODEL,USERNAME,VALUE) VALUES (1,'UPDATE',TO_TIMESTAMP('2015-04-30 11:11:25.461','YYYY-MM-DD HH24:MI:SS.FF'),1,'0:0:0:0:0:0:0:1',NULL,'HourlyType','ROOT','HourlyType [id=1, labelFr=Administrative, labelEn=Administratif]');


/*==============================================================*/
/* Table : ALERT                                                */
/*==============================================================*/
INSERT INTO ALERT ( ID, BRAND, COUNTRY_ID, ENDDATE, LABEL, MANUFACTURER, MODEL, STARTDATE, SERVICES_ITEM_ID ) VALUES ( 1, 'BRAND_value1', 'TN', to_date('2016-05-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'LABEL_value', 'MANUFACTURER_value', 'MODEL_value', to_date('2015-05-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 11 );
INSERT INTO ALERT ( ID, BRAND, COUNTRY_ID, ENDDATE, LABEL, MANUFACTURER, MODEL, STARTDATE, SERVICES_ITEM_ID ) VALUES ( 2, 'BRAND_value2', 'TR', to_date('2016-05-06 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'LABEL_value', 'MANUFACTURER_value', 'MODEL_value', to_date('2015-05-02 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 11 );
INSERT INTO ALERT ( ID, BRAND, COUNTRY_ID, ENDDATE, LABEL, MANUFACTURER, MODEL, STARTDATE, SERVICES_ITEM_ID ) VALUES ( 3, 'BRAND_value3', 'UG', to_date('2015-05-10 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'LABEL_value', 'MANUFACTURER_value', 'MODEL_value', to_date('2015-05-06 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 11 );
INSERT INTO ALERT ( ID, BRAND, COUNTRY_ID, ENDDATE, LABEL, MANUFACTURER, MODEL, STARTDATE, SERVICES_ITEM_ID ) VALUES ( 4, 'BRAND_value4', 'TN', to_date('2015-06-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'LABEL_value', 'MANUFACTURER_value', 'MODEL_value', to_date('2015-06-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 4 );



/*==============================================================*/
/* Table : CIBLAGE                                                */
/*==============================================================*/
INSERT INTO CIBLAGE ( ID, BRAND, COUNTRY_ID, ENDDATE, MANUFACTURER, MODEL, STARTDATE, SERVICESITEM_ID ) VALUES ( 1, 'BRAND_value', 'TN', to_date('2015-11-15 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MANUFACTURER_value', 'MODEL_value', to_date('2015-05-02 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 11 );
INSERT INTO CIBLAGE ( ID, BRAND, COUNTRY_ID, ENDDATE, MANUFACTURER, MODEL, STARTDATE, SERVICESITEM_ID ) VALUES ( 2, 'BRAND_value', 'TR', to_date('2015-11-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MANUFACTURER_value', 'MODEL_value', to_date('2015-05-11 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 10);
INSERT INTO CIBLAGE ( ID, BRAND, COUNTRY_ID, ENDDATE, MANUFACTURER, MODEL, STARTDATE, SERVICESITEM_ID ) VALUES ( 3, 'BRAND_value', 'UG', to_date('2015-04-25 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MANUFACTURER_value', 'MODEL_value', to_date('2015-05-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 11 );
INSERT INTO CIBLAGE ( ID, BRAND, COUNTRY_ID, ENDDATE, MANUFACTURER, MODEL, STARTDATE, SERVICESITEM_ID ) VALUES ( 4, 'BRAND_value', 'TN', to_date('2015-04-30 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'MANUFACTURER_value', 'MODEL_value', to_date('2015-06-26 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 4 );
COMMIT;

/*==============================================================*/
/* Table : FILE_ITEM_FIELD_VALUE                                */
/*==============================================================*/
INSERT INTO FILE_FIELD_VALUE (VALUE, FILE_FIELD_ID, FILE_ID) VALUES ('ES-140', 1, 1);
INSERT INTO FILE_FIELD_VALUE (VALUE, FILE_FIELD_ID, FILE_ID) VALUES ('PAYS_ORIGINE_CODE', 2, 2);
INSERT INTO FILE_FIELD_VALUE (VALUE, FILE_FIELD_ID, FILE_ID) VALUES ('02/02/2014', 3, 2);

/*==============================================================*/
/* Table : FILE_ITEM_FIELD_VALUE                                */
/*==============================================================*/

INSERT INTO FILE_ITEM_FIELD_VALUE (VALUE,FILE_ITEM_ID,FILE_ITEM_FIELD_ID) VALUES ('Chaussures LACOSTE',1,1);
INSERT INTO FILE_ITEM_FIELD_VALUE (VALUE,FILE_ITEM_ID,FILE_ITEM_FIELD_ID) VALUES ('LACOSTE essential sport 75ml',2,1);
INSERT INTO FILE_ITEM_FIELD_VALUE (VALUE,FILE_ITEM_ID,FILE_ITEM_FIELD_ID) VALUES ('LACOSTE essential sport 75ml',3,2);
INSERT INTO FILE_ITEM_FIELD_VALUE (VALUE,FILE_ITEM_ID,FILE_ITEM_FIELD_ID) VALUES ('Chaussures LACOSTE',4,2);
INSERT INTO FILE_ITEM_FIELD_VALUE (VALUE,FILE_ITEM_ID,FILE_ITEM_FIELD_ID) VALUES ('200',1,2);

/*==============================================================*/
/* Table : DELEGATION                                           */
/*==============================================================*/
INSERT INTO DELEGATION (ID, BEGIN_DATE, DELETED, ENABLED, END_DATE, FROM_USER, TO_USER) VALUES (1, to_date('2015-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 0, 1, to_date('20116-06-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 20, 30);
INSERT INTO DELEGATION (ID, BEGIN_DATE, DELETED, ENABLED, END_DATE, FROM_USER, TO_USER) VALUES (2, to_date('2015-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 0, 1, to_date('20116-06-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 2, 49);
COMMIT;

/*==============================================================*/
/* Table : CONTROLLER_HOLIDAY                                   */
/*==============================================================*/
INSERT INTO CONTROLLER_HOLIDAY (ID, DELETED, ENABLED, FROM_DATE, TO_DATE, USER_ID) VALUES (1, 0, 1, to_date('2015-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), to_date('2016-06-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 10);
INSERT INTO CONTROLLER_HOLIDAY (ID, DELETED, ENABLED, FROM_DATE, TO_DATE, USER_ID) VALUES (2, 0, 1, to_date('2015-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), to_date('2016-06-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 22);   
COMMIT;





