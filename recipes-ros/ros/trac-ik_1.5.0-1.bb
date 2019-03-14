DESCRIPTION = "The ROS packages in this repository were created to provide an improved alternative Inverse Kinematics solver to the popular inverse Jacobian methods in KDL. TRAC-IK handles joint-limited chains better than KDL without increasing solve time."
AUTHOR = "Patrick Beeson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "trac-ik-examples trac-ik-kinematics-plugin trac-ik-lib trac-ik-python"

RDEPENDS_${PN} = "trac-ik-examples trac-ik-kinematics-plugin trac-ik-lib trac-ik-python"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik/1.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2eb3c1d74d617f7c888cc28182966c03"
SRC_URI[sha256sum] = "c985213ab2ea13f1d77ffd934d03abb7f1cd6364f98247d8ce9d483161cd6b32"

S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik-1.5.0-1"

inherit catkin
