
DEFINE TEMP-TABLE tt_natur-oper
    FIELD nat_operacao  AS CHAR FORMAT "x(06)"  LABEL "nat_operacao"  init "ERRO"
    FIELD denominacao   AS CHAR FORMAT "x(35)"  LABEL "denominacao"   init "ERRO"
    FIELD aliquota_icm  AS DECIMAL              LABEL "aliquota_icm"  init  999.99
    FIELD tipo          AS CHAR FORMAT "x(10)"  LABEL "tipo"          init "ERRO".

PROCEDURE soma:
    DEFINE INPUT PARAMETER value1 AS INTEGER NO-UNDO. 
    DEFINE INPUT PARAMETER value2 AS INTEGER NO-UNDO. 
    DEFINE OUTPUT PARAMETER resultado AS INTEGER NO-UNDO.
    resultado  = value1 + value2.
END PROCEDURE.


PROCEDURE getNatureza:
    DEFINE INPUT-OUTPUT PARAMETER nat_operacao AS CHAR NO-UNDO. 
    DEFINE INPUT-OUTPUT PARAMETER TABLE FOR tt_natur-oper.
    EMPTY TEMP-TABLE tt_natur-oper.
   
    FOR EACH natur-oper WHERE (natur-oper.nat-operacao = nat_operacao OR nat_operacao = "") AND 
                              natur-oper.nat-ativa = TRUE NO-LOCK :
        CREATE tt_natur-oper.
        ASSIGN
            tt_natur-oper.nat_operacao = natur-oper.nat-operacao
            tt_natur-oper.denominacao  = natur-oper.denominacao  
            tt_natur-oper.aliquota_icm = natur-oper.aliquota-icm
            tt_natur-oper.tipo         = {ininc/i06in245.i 4 natur-oper.tipo}.
    END.
END PROCEDURE.
