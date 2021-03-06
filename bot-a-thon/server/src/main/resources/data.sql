INSERT INTO store (name, email, address) VALUES ('MOUNT PEARL, NL', 'viktor_letunovskyi@epam.com', '26 Merchant Drive Mount Pearl, NL A1N 5J5');

INSERT INTO user (name, email, store_id) VALUES ('Anna Kurmaz', 'anna_kurmaz@epam.com', 1);
INSERT INTO user (name, email, store_id) VALUES ('Duy Minh Le', 'duy_minh_le@epam.com', 1);
INSERT INTO user (name, email, store_id) VALUES ('Oleksandr Borysov', 'oleksandr_borysov@epam.com', 1);
INSERT INTO user (name, email, store_id) VALUES ('Volodymyr Kara', 'volodymyr_kara@epam.com', 1);
INSERT INTO user (name, email, store_id) VALUES ('Viktor Letunovskyi', 'viktor_letunovskyi@epam.com', 1);

INSERT INTO category (id, name) VALUES (1, 'Snacks, Pantry');
INSERT INTO category (id, name) VALUES (2, 'Bathroom');
INSERT INTO category (id, name) VALUES (3, 'Office');
INSERT INTO category (id, name) VALUES (4, 'Coffee/Drinks');
INSERT INTO category (id, name) VALUES (5, 'Laundry');
INSERT INTO category (id, name) VALUES (6, 'Pets');
INSERT INTO category (id, name) VALUES (7, 'Staples');
INSERT INTO category (id, name) VALUES (8, 'Cleaning');

INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Chocolate almonds', 4.40, 'chocolate_almonds.jpg', '1234567890');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Chips', 1.53, 'chips.jpg', '1234567891');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Candy', 3.40, 'candy.jpg', '1234567892');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Chocolate', 7.20, 'chocolate.jpg', '1234567893');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Nuts', 3.25, 'nuts.jpg', '1234567894');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Dried fruit', 6.50, 'dried_mango.jpg', '1234567895');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Coca Cola', 7.50, 'coca_cola.jpg', '5449000008046');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (1, 'Yogurt Chudo', 5.30, 'chudo.jpg', '4823061320117');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (2, 'Hand soap', 7.30, 'hand_soap.jpg', '1234567895');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (2, 'Body soap', 5.40, 'body_soap.jpg', '1234567896');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (2, 'Toilet paper', 4.20, 'toilet_paper.jpg', '1234567897');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (2, 'Toothpaste', 2.38, 'toothpaste.jpg', '1234567898');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (2, 'Toothbrush', 1.73, 'toothbrush.jpg', '1234567899');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (3, 'Notebook', 1.54, 'notebook.jpg', '1234567880');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (3, 'Pen', 0.80, 'pen.jpg', '1234567881');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (3, 'Scissors', 4.40, 'scissors.jpg', '1234567882');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (4, 'Tassimo pods', 3.24, 'tassimo_pods.jpg', '1234567883');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (4, 'Keurig k-cups',8.50, 'keurig_k_cups.jpg', '1234567884');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (4, 'Tea', 0.70, 'tea.jpg', '1234567885');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (5, 'Laundry detergent', 7.35, 'laundry_detergent.jpg', '1234567886');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (5, 'Bounce', 3.50, 'bounce.jpg', '1234567887');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (6, 'Pet food', 4.20, 'pet_food.jpg', '1234567888');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (6, 'Pet shampoo', 7.10, 'pet_shampoo.jpg', '1234567889');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Paper towel', 1.82, 'paper_towel.jpg', '1234567870');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Tissue paper', 1.70, 'tissue_paper.jpg', '1234567871');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Napkins', 0.80, 'napkins.jpg', '1234567872');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Hand sanitizer', 2.20, 'hand_sanitizer.jpg', '1234567873');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Dishwasher pods', 3.20, 'dishwasher_pods.jpg', '1234567874');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Dish soap', 1.10, 'dish_soap.jpg', '1234567875');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Soda stream refills', 4.50, 'sodastream_refills.jpg', '1234567876');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Brita filters', 3.47, 'brita_filters.jpg', '1234567877');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (7, 'Baking soda', 4.50, 'baking_soda.jpg', '1234567878');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (8, 'Cleaning products', 1.80, 'cleaning_products.jpg', '1234567879');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (8, 'Swiffer products', 1.70, 'swiffer_products.jpg', '1234567860');

INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (6, 'Friskies with chicken', 0.70, 'friskies.jpg', '7613033926716');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (8, 'Microfiber cleaning cloths', 1.20, 'cloth.jpg', '4820164965764');
INSERT INTO product (category_id, name, price, image_uri, bar_code) VALUES (8, 'Cillit power cleaner', 2.70, 'cillit.jpg', '5900627003000');


INSERT INTO recurring_template (user_id, name) VALUES(1, 'test');

INSERT INTO recurring_item (template_id, product_id, quantity) VALUES(1, 1, 4);
INSERT INTO recurring_item (template_id, product_id, quantity) VALUES(1, 2, 2);
INSERT INTO recurring_item (template_id, product_id, quantity) VALUES(1, 3, 1);