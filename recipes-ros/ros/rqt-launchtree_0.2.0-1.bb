DESCRIPTION = "An RQT plugin for hierarchical launchfile configuration introspection."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch rospy rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "roslaunch rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/pschillinger/rqt_launchtree-release/archive/release/melodic/rqt_launchtree/0.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2998ed5be10d50af0975a6ae210b8003"
SRC_URI[sha256sum] = "0eb679a1667c49340b2cd90602a653377d5b5582cc782d9fc8b2a58d9b9dc79e"

S = "${WORKDIR}/rqt_launchtree-release-release-melodic-rqt_launchtree-0.2.0-1"

inherit catkin
