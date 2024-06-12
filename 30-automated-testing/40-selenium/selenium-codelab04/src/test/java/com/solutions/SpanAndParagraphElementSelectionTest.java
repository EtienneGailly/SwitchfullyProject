package com.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = SeleniumConfiguration.class)
public class SpanAndParagraphElementSelectionTest {

    @Autowired
    ElementSelectionPage elementSelectionPage;

    @Test
    void addingAnElementToTheList() {
        List<String> itemList = elementSelectionPage.open()
                .addListItem("Strawberry")
                .getListItemList();

        Assertions.assertThat(itemList.get(itemList.size() - 1)).isEqualTo("Strawberry");
    }

    @Test
    void addingTwoElementsToTheList() {
        List<String> listItemList = elementSelectionPage.open()
                .addListItem("Strawberry")
                .addListItem("Stock")
                .getListItemList();

        Assertions.assertThat(listItemList.get(listItemList.size() - 2)).isEqualTo("Strawberry");
        Assertions.assertThat(listItemList.get(listItemList.size() - 1)).isEqualTo("Stock");
    }
}
