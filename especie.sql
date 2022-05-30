

DROP TABLE if exists especies;
CREATE TABLE especies(	
    nombre      VARCHAR(100),
   	habitat     VARCHAR(200),
   	profundidad INT(100),
   	prosharks   BOOLEAN,
   	tiemponavegacion INT(100),
   	fuerzaViento VARCHAR(200),
   	hora       VARCHAR(200),
   	tiempo   INT(100),
	parasitos  VARCHAR(200),
	presenciaAnzuelos VARCHAR(200),
	numeroAnzuelos INT(100),
	cebo  VARCHAR(200),
	sexo  VARCHAR(200),
	embarcaciones  INT(100),
	nubosidad  VARCHAR(200),
	dirrecionViento  VARCHAR(200)
);
