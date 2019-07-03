DESCRIPTION = "Examples of how to use the xpp framework."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosbag xpp-vis xpp-hyq xpp-quadrotor"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_examples/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "23a4149ece12af11690fd4ec6df92289"
SRC_URI[sha256sum] = "df300b82eb4135d5c0343d75f1c11dc6e3c03df09b07582ab3a4f753338522df"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_examples-1.0.10-0"

inherit catkin
