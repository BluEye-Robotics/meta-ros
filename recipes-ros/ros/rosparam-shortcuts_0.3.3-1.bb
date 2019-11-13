DESCRIPTION = "Quickly load variables from rosparam with good command line error checking."
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp cmake-modules libeigen eigen-conversions roslint roscpp eigen-conversions"

RDEPENDS_${PN} = "roscpp eigen-conversions"

SRC_URI = "https://github.com/PickNikRobotics/rosparam_shortcuts-release/archive/release/melodic/rosparam_shortcuts/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c9b9f3407ae5c0c801dd225999f2aa3e"
SRC_URI[sha256sum] = "e98b3641823b5ebc202bf41a8c62202f8c26fd7d898c9c9a32fb1812771b9554"

S = "${WORKDIR}/rosparam_shortcuts-release-release-melodic-rosparam_shortcuts-0.3.3-1"

inherit catkin
