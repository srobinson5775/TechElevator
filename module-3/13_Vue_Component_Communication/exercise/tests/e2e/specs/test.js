// https://docs.cypress.io/api/introduction/api.html

describe('Component Communication Exercise', () => {
  beforeEach(() => {
    cy.visit('/');
  });

  describe('Step One Tests', () => {
    it('should show divs for all book data', () => {
      cy.get(".card").should('have.length', 4);
    });
  });

  describe('Step Two Tests', () => {
    it('should show title for all books', () => {
      cy.get(".book-title").should("have.length", 4);
      cy.get(".book-title").eq(0).contains("", "Kafka on the Shore");
      cy.get(".book-title").eq(1).contains("", "The Girl With All the Gifts");
      cy.get(".book-title").eq(2).contains("", "The Old Man and the Sea");
      cy.get(".book-title").eq(3).contains("", "Le Petit Prince");
    });
    it('should show title for all books', () => {
      cy.get(".book-author").should("have.length", 4);
      cy.get(".book-author").eq(0).contains("", "Haruki Murakami");
      cy.get(".book-author").eq(1).contains("", "M.R. Carey");
      cy.get(".book-author").eq(2).contains("", "Ernest Hemingway");
      cy.get(".book-author").eq(3).contains("", "Antoine de Saint-Exupéry");
    });
    it('should show cover image for all books', () => {
      cy.get(".book-image").should("have.length", 4);
      cy.get(".book-image").eq(0).should("have.attr", "src").and("include", "9781784877989");
      cy.get(".book-image").eq(1).should("have.attr", "src").and("include", "9780356500157");
      cy.get(".book-image").eq(2).should("have.attr", "src").and("include", "9780684830490");
      cy.get(".book-image").eq(3).should("have.attr", "src").and("include", "9783125971400");
    });
  });

  describe("Step Three Tests", () => {
    it('mark read/unread buttons should exist', () => {
      cy.get(".mark-read, .mark-unread").should("exist");
      cy.get(".mark-read:visible, .mark-unread:visible")
        .should("have.length", 4);
    })

    it('cards should have read class', () => {
      cy.get(".card.read").should("have.length", 2);
    })

    it('should mark book as read when "Mark Read" button is pressed', () => {
      cy.get(".card:has(> .mark-read:visible)")
        .first()
        .as("card");
      cy.get("@card")
        .find(".mark-read")
        .click();
      cy.get("@card")
        .find(".mark-read:visible")
        .should("not.exist");
      cy.get("@card").should("have.class", "read");
      cy.get("@card").find(".mark-unread");
    });

    it('should mark book as unread when "Mark Unread" button is pressed', () => {
      cy.get(".card:has(> .mark-unread:visible)")
        .first()
        .as("card");
      cy.get("@card")
        .find(".mark-unread")
        .click();
      cy.get("@card")
        .find(".mark-unread:visible")
        .should("not.exist");
      cy.get("@card").should("not.have.class", "read");
      cy.get("@card").find(".mark-read");
    });
  });

  describe("Step Four Tests", () => {
    it('new book form should exist', () => {
      cy.get("form.new-book-form").should("exist");
      cy.get("input.title-input").should("exist");
      cy.get("input.author-input").should("exist");
      cy.get("input.isbn-input").should("exist");
    });

    it('should add a new card when a book is added in the form', () => {
      cy.get(".title-input").type("TEST BOOK");
      cy.get(".author-input").type("TEST AUTHOR");
      cy.get(".isbn-input").type("1111111111{enter}");

      cy.contains(".card", "TEST BOOK").as("card");

      cy.get("@card").find(".book-title", "TEST BOOK");
      cy.get("@card").find(".book-author", "TEST AUTHOR");
      cy.get("@card")
        .find(".book-image")
        .should("have.attr", "src")
        .and("include", "1111111111");
      cy.get("@card")
        .find("button")
        .should("have.class", "mark-read");
    });
  });
});
