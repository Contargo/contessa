Contessa
========

A very simple media content service, built on **Spring Boot**. Provides a quick
and easy way to manage the storage, upload and access to media and assets, in a
situation where a real [CDN][1] may not (yet) be a viable solution.

  [1]: https://en.wikipedia.org/wiki/Content_delivery_network


Design &amp; Idea
-----------------

The main intent is to have a simple content service, with a strict and minimal
API surface. Users should be able to submit and retrieve, content files in some
appropriate ways.

Contessa will provide a very rich configurable out-of-the-box solution, that
offers a sensible and adaptive solution to business hosting of media content.

### Extensible structure

The design goal is to provide a separation between the two most important
sub-systems or _tiers_ - the user interface or API and the storage backend or
data repository.

#### Configurable data repository

Using a simple set of configurations, the storage of data can be controlled, and
easily set up for local filestorage, SQL or NoSQL storage.

Each storage comes with a different set of capabilities and Contessa allows for
an adaptable solution, that suites many different business goals.

#### Optional user interfaces

Accessing or uploading data can be made in several different ways. From plain
HTTP or web to REST-ful APIs, file-system polling or message bus brokers, the
feature-set is rich and very capable. This puts Contessa in a compatibility
level of its own.


Development &amp; Stack
-----------------------

The current aim and goal of Contessa is to ensure the best possible capabilities
for a meda content storage - but also, to stay within the boundaries of a very
well understood and capable technical stack.

Building on [Java][2] and [Spring Boot][3], currently mean that we can leverage
the knowledge and interest of a whole lof of developers. We believe these
developers to also be great ambassadors for Contessa, if we can provide them
with idiomatic, transparent and well thought out code.

  [2]: https://java.oracle.com
  [3]: http://projects.spring.io/spring-boot/

### Building &amp; testing

Anyone should be able to join in, and as the project evolves we will provide
more specific information. At the moment running the project should be as easy
as starting the project using the shortcut in the `Makefile`:

    > make start

Happy hacking!
