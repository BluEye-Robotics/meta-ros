DESCRIPTION = "Quickly load variables from rosparam with good command line error checking."
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp cmake-modules libeigen eigen-conversions roslint roscpp libeigen"

RDEPENDS_${PN} = "roscpp libeigen"

SRC_URI = "https://github.com/PickNikRobotics/rosparam_shortcuts-release/archive/release/melodic/rosparam_shortcuts/0.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2da840d4a0df2066a52a5b7e9f6b0a8b"
SRC_URI[sha256sum] = "179fe82f1e7b18f2ca81cf26d7ffce77d1533987e5c27a3325563a31d7218504"

S = "${WORKDIR}/rosparam_shortcuts-release-release-melodic-rosparam_shortcuts-0.2.1-0"

inherit catkin
