DESCRIPTION = "Quickly load variables from rosparam with good command line error checking."
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp cmake-modules libeigen eigen-conversions roslint roscpp libeigen"

RDEPENDS_${PN} = "roscpp libeigen"

SRC_URI = "https://github.com/PickNikRobotics/rosparam_shortcuts-release/archive/release/melodic/rosparam_shortcuts/0.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae291798743da99e16e11b7f1de67642"
SRC_URI[sha256sum] = "98ae1e0dfc847978257e1ec58b7c183ac4304dc620ac460356d33473adba7042"

S = "${WORKDIR}/rosparam_shortcuts-release-release-melodic-rosparam_shortcuts-0.3.1-1"

inherit catkin
