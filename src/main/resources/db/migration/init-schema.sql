CREATE TABLE ingredient
(
    id   BIGINT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NULL,
    type VARCHAR(255) NULL,
    CONSTRAINT pk_ingredient PRIMARY KEY (id)
);

CREATE TABLE ingredient_amount
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    ingredient_id BIGINT NULL,
    CONSTRAINT pk_ingredientamount PRIMARY KEY (id)
);

CREATE TABLE ingredient_storage_information
(
    id                    BIGINT AUTO_INCREMENT NOT NULL,
    amount_id             BIGINT NULL,
    notification_limit_id BIGINT NULL,
    maximum_limit_id      BIGINT NULL,
    CONSTRAINT pk_ingredientstorageinformation PRIMARY KEY (id)
);

CREATE TABLE recept_step
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    CONSTRAINT pk_receptstep PRIMARY KEY (id)
);

ALTER TABLE ingredient_amount
    ADD CONSTRAINT FK_INGREDIENTAMOUNT_ON_ID FOREIGN KEY (id) REFERENCES recept_step (id);

ALTER TABLE ingredient_amount
    ADD CONSTRAINT FK_INGREDIENTAMOUNT_ON_INGREDIENT FOREIGN KEY (ingredient_id) REFERENCES ingredient (id);

ALTER TABLE ingredient_storage_information
    ADD CONSTRAINT FK_INGREDIENTSTORAGEINFORMATION_ON_AMOUNT FOREIGN KEY (amount_id) REFERENCES ingredient_amount (id);

ALTER TABLE ingredient_storage_information
    ADD CONSTRAINT FK_INGREDIENTSTORAGEINFORMATION_ON_MAXIMUMLIMIT FOREIGN KEY (maximum_limit_id) REFERENCES ingredient_amount (id);

ALTER TABLE ingredient_storage_information
    ADD CONSTRAINT FK_INGREDIENTSTORAGEINFORMATION_ON_NOTIFICATIONLIMIT FOREIGN KEY (notification_limit_id) REFERENCES ingredient_amount (id);