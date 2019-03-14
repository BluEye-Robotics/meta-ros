DESCRIPTION = "This package contains a number of scripts to set various components of the PR2. They are used in the apps to improve usablity."
AUTHOR = "Tony Pratkanis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib rospy tf pr2-controllers-msgs actionlib rospy tf pr2-controllers-msgs"

RDEPENDS_${PN} = "actionlib rospy tf pr2-controllers-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_position_scripts/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fc4961b92f23cd6475254f11d13feed1"
SRC_URI[sha256sum] = "8a6dddf6474456caf8bc7efdec66febbabfc1c4f5c4ca533a0520dcc5b6b660c"

ROS_SPN = "pr2_apps"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_position_scripts-0.6.1-0"

inherit catkin
