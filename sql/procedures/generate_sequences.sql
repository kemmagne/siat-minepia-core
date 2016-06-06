/* this query generate an sequences create script from SIAT_CT Schema */. 
CREATE OR replace PROCEDURE GENERATE_SEQUENCES AS 

BEGIN
FOR rec IN (

SELECT  
       'CREATE SEQUENCE '   || SEQUENCE_NAME ||
        ' INCREMENT BY '    || INCREMENT_BY  ||
        ' START WITH '      || LAST_NUMBER   ||
        ' MINVALUE '        || MIN_VALUE     ||
        ' MAXVALUE '        || MAX_VALUE     ||
          CASE CYCLE_FLAG WHEN 'N' THEN ' NOCYCLE ' ELSE ' CYCLE ' END ||
          CASE ORDER_FLAG WHEN 'N' THEN ' NOORDER ' ELSE ' ORDER ' END ||
        ' CACHE ' || CACHE_SIZE || ';' as line
FROM ALL_SEQUENCES WHERE SEQUENCE_OWNER = 'SIAT_CT'
ORDER BY SEQUENCE_NAME)

LOOP
	dbms_output.put_line(rec.line);
END LOOP;

END;
