<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`SEMAE` module definition
=========================

SEMAE poc module

`SemAccount` business object definition
---------------------------------------

A legal entity

### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `semAccExternalIdentifier`                                   | id                                       | yes*     | yes       |          | NRID decimal(15,0) Identifiant unique (interne au CRM)                           |
| `semAccClientNumber`                                         | char(50)                                 | yes      | yes       |          | CD varchar(50) N° de client                                                      |
| `semAccSoc`                                                  | char(30)                                 | yes      | yes       |          | VAR2 varchar(30) n° SOC                                                          |
| `semAccAe`                                                   | char(30)                                 | yes      | yes       |          | -                                                                                |
| `semAccCorporateName`                                        | char(50)                                 | yes      | yes       |          | SOCIETE varchar(50) Raison sociale                                               |

`SemDeclaration` business object definition
-------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `semDeclarationIdentifier`                                   | char(50)                                 | yes*     | yes       |          | -                                                                                |
| `semDeclarationWeight`                                       | bigdec(6, 0)                             | yes      | yes       |          | -                                                                                |
| `semDeclarationValidationStatus`                             | enum(30) using `SEM_VALIDATION_STATE` list | yes      | yes       |          | -                                                                                |
| `semDeclarationComment`                                      | text(1000)                               |          | yes       |          | -                                                                                |

### Lists

* `SEM_VALIDATION_STATE`
    - `PEN` 
    - `VAL` 
    - `REJ` 

`SemExternalColaborator` business object definition
---------------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|

`SemSpecies` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `semSpeciesKey`                                              | char(3)                                  | yes*     | yes       |          | ESPECE char(3) Clé unique                                                        |
| `semSpeciesLabel`                                            | char(50)                                 | yes      | yes       |          | -                                                                                |

