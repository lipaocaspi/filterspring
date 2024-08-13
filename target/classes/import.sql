INSERT INTO filterspring.country (codecountry, namecountry) VALUES("COL", "Colombia");
INSERT INTO filterspring.region (codereg, codecountry, namereg) VALUES("CUN", "COL", "Cundinamarca");
INSERT INTO filterspring.region (codereg, codecountry, namereg) VALUES("ANT", "COL", "Antioquia");
INSERT INTO filterspring.region (codereg, codecountry, namereg) VALUES("SAN", "COL", "Santander");
INSERT INTO filterspring.city (codecity, codereg, namecity) VALUES("BOG", "CUN", "Bogota");
INSERT INTO filterspring.city (codecity, codereg, namecity) VALUES("MED", "ANT", "Medellin");
INSERT INTO filterspring.city (codecity, codereg, namecity) VALUES("BUC", "SAN", "Bucaramanga");

INSERT INTO filterspring.farmacy (codecity, latfarmacy, long1, logofarmacy, namefarmacy, addressfarmacy) VALUES("BOG", 6, 6, "Rebaja", "Drogas La Rebaja", "Clle 36");
INSERT INTO filterspring.farmacy (codecity, latfarmacy, long1, logofarmacy, namefarmacy, addressfarmacy) VALUES("MED", 4, 4, "FarmaTodo", "Farmacia FarmaTodo", "Cra 40");
INSERT INTO filterspring.farmacy (codecity, latfarmacy, long1, logofarmacy, namefarmacy, addressfarmacy) VALUES("BUC", 5, 5, "Pinzon", "Drogueria Pinzon", "Clle 36");