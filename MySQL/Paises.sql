

/*1*/
SELECT countries.name,languages.language,languages.percentage FROM languages
join countries on languages.country_id=countries.id
WHERE language="Slovene"
ORDER BY percentage DESC
;

/*2*/
SELECT countries.name,max(languages.language),COUNT(countries.id) as ciudades FROM cities
JOIN countries ON cities.country_id=countries.id
JOIN languages ON countries.id=languages.country_id
GROUP BY countries.name
ORDER BY ciudades DESC
;

/*3*/
SELECT * FROM cities
WHERE population >500000 AND country_code="MEX"
ORDER BY population DESC
;

/*4*/
SELECT * FROM languages
WHERE percentage >89
ORDER BY percentage DESC
;

/*5*/
SELECT * FROM countries
WHERE surface_area<501 AND population>100000
ORDER BY surface_area
;

/*6*/
SELECT * FROM countries
WHERE government_form= "Constitutional Monarchy" 
AND  life_expectancy >75 
AND capital >200
;

/*7*/
SELECT countries.name,cities.name,cities.district,cities.population FROM cities
JOIN countries ON cities.country_id=countries.id
WHERE district = "Buenos Aires"
AND cities.population> 500000
;

/*8*/
SELECT countries.region,COUNT(countries.region) as countries FROM countries
GROUP BY countries.region
ORDER BY countries DESC;