INSERT INTO filterspring.country (codecountry, namecountry) VALUES("COL", "Colombia");
INSERT INTO filterspring.region (codereg, codecountry, namereg) VALUES("CUN", "COL", "Cundinamarca");
INSERT INTO filterspring.city (codecity, codereg, namecity) VALUES("BOG", "CUN", "Bogota");

INSERT INTO filterspring.farmacy (codecity, latfarmacy, long1, logofarmacy, namefarmacy, addressfarmacy) VALUES("BOG", 1.5, 1.5, "Pinzon", "Drogueria Pinzon", "Clle 36");