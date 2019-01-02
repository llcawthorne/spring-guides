# gs-uploading-files #

Probably not the best example considering it gets deprecation warnings
on some of the methods it uses.  I wonder the proper way to do this now...

Anyway, it was an alright guide.  It made you download the source for the
StorageService implementation rather than provide it in the guide, which
was mildly annoying.  It also kept an integration test and a storage service
test as download only and barely mentioned them in the guide.  Both were
pretty good examples of how to wire some tests for these things.

When I typed in everything, I put 128K instead of 128KB and wondered for
a bit why I kept getting a NumberFormatException when trying to run this
app.  Finally caught my mistake when I compared my source to the provided
source download.