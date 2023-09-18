-- crea una nuova colonna con la concatenazione delle due fornite in parametro
CONCAT(COLUMN1, COLUMN2) AS ALIAS_NAME

-- restituisce una colonna data in parametro con tutti i caratteri minuscoli
 LOWER(COLUMN)

 -- restituisce una colonna data in parametro con tutti i caratteri maiuscoli
 UPPER(COLUMN)

 -- restituisce una colonna di testo data in parametro senza gli spazi vuoti all'inizio e alla fine
 TRIM(COLUMN)

 -- restituisce la lunghezza della colonna di testo in valore numerico
 LENGTH(COLUMN)

 -- prendendo in parametro una colonna di testo, restituisce delle stringhe lunghe LENGTH e che iniziano da un indice START
 SUBSTRING(COLUMN, START, LENGTH)

 -- arrotonda i numeri in COLUMN, i numeri avranno un numero specificato di decimali da arrotondare tramite DECIMAL_PLACES
 ROUND(COLUMN, DECIMAL_PLACES)

 -- aggiunge un'addizione del tempo alla colonna con l'espressione dell'intervallo usata
 DATE_ADD(COLUMN, INTERVAL EXPRESSION UNIT)

 -- aggiunge una sottrazione del tempo alla colonna con l'espressione dell'intervallo usata
 DATE_SUB(COLUMN, INTERVAL EXPRESSION UNIT)

 -- formatta la colonna data in parametro in una stringa
 FORMAT(COLUMN, FORMAT_STRING)

