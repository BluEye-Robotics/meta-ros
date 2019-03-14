DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed or computed field values."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg python-pyqt5 qt-gui-py-common roslib rosmsg rqt-gui rqt-gui-py rqt-py-common"

RDEPENDS_${PN} = "python-rospkg python-pyqt5 qt-gui-py-common roslib rosmsg rqt-gui rqt-gui-py rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_publisher-release/archive/release/melodic/rqt_publisher/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "77510be0066aadc900af66ab429a9370"
SRC_URI[sha256sum] = "9411fa1eb8fefee5ab7653c83dc2baa44cf352797759436fdfaa48de29e098e3"

S = "${WORKDIR}/rqt_publisher-release-release-melodic-rqt_publisher-0.4.8-0"

inherit catkin
