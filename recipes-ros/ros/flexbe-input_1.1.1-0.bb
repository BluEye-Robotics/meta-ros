DESCRIPTION = "flexbe_input enables to send data to onboard behavior when required."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib smach-ros rospy flexbe-msgs"

RDEPENDS_${PN} = "actionlib smach-ros rospy flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_input/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e6e9bbcaf9123ee710a6815511c0749b"
SRC_URI[sha256sum] = "5df6e897ef3b2b6890162fce3b14381f09fcb9d04cbfae3b2aa2d59cb50408ff"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_input-1.1.1-0"

inherit catkin
