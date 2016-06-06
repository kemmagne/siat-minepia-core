CREATE OR REPLACE PROCEDURE DROP_TABLES_SEQUENCES AS 

BEGIN

  --DELETE SEQUENCES!
  FOR I IN (SELECT US.SEQUENCE_NAME
              FROM USER_SEQUENCES US) LOOP
    EXECUTE IMMEDIATE 'DROP SEQUENCE '|| I.SEQUENCE_NAME ||'';
  END LOOP;

  --DELETE TABLES!
  FOR I IN (SELECT UT.TABLE_NAME
              FROM USER_TABLES UT) LOOP
    EXECUTE IMMEDIATE 'DROP TABLE '|| I.TABLE_NAME ||' CASCADE CONSTRAINTS ';
  END LOOP;

END;