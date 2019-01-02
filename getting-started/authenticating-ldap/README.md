# Authenticating LDAP #

This one is kind've annoying, because it just doesn't work.  I downloaded their copy of the code and tried
to run it too, and it won't let me login with either ben/benspassword or bob/bobspassword.  Mine had the
same problem, which is why I downloaded theres.  I took a course on Spring Security earlier today, and
I don't see anything obviously wrong with it.  It's a shame, cause authenticating through LDAP is something
I need to do (more with Active Directory, so this still isn't the best example, but better than nothing).

Weird thing is, the test works with ben/benspassword.  I'm going to try turning csrf off in case it's that..
Nope.  That didn't fix it either.  Weird.  I don't see any CSRF token being passwed by their default login
form.  Oh well.  Not sure what is wrong with this one.  Tests pass as ben/benspassword but real app
doesn't take it.  Tests fail to authenticate with invalid/invalidpassword.

TODO: Compare this to your Spring Security course LDAP implementation and see
if you can figure out what's going wrong here.
