Import the project in eclipse/STS
Import >Git >Project from Git >Clone URI >In URI paste project link >Next >Selctt directory >Finish
once import is completed, Add the JDK

# Step 1: Check Java Build Path
Right-click your project (SpringBootStaticProject)
Choose Build Path > Configure Build Path
Go to the Libraries tab
If you see:
❌ No JRE System Library OR
❌ A red X next to JRE System Library
You need to fix or re-add it.

# Step 2: Add the JDK Back
In the Libraries tab, click Add Library…
Select JRE System Library, then click Next
Choose one:
Workspace default JRE (e.g., Java SE 17) – recommended if it’s already correct
Or choose Installed JREs… if you have a specific version like JDK 11 or JDK 17
❗ If you don’t see a valid JDK, click Installed JREs > Add > Standard VM, and browse to your JDK folder (e.g., C:\Program Files\Java\jdk-17 or /Library/Java/JavaVirtualMachines/jdk-17.jdk on macOS)
Click Finish, then Apply and Close

# Step 3: Clean and Rebuild
Go to Project > Clean…
Select your project and click Clean


Now run the project.
