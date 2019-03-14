DESCRIPTION = "rqt_nav_view provides a gui for viewing navigation maps and paths."
AUTHOR = "Ze'ev Klapow"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs nav-msgs python-pyqt5 qt-gui rospy rqt-gui rqt-gui-py rqt-py-common tf"

RDEPENDS_${PN} = "geometry-msgs nav-msgs python-pyqt5 qt-gui rospy rqt-gui rqt-gui-py rqt-py-common tf"

SRC_URI = "https://github.com/ros-gbp/rqt_nav_view-release/archive/release/melodic/rqt_nav_view/0.5.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c73f7e79682b0322d17906ada3f4c63b"
SRC_URI[sha256sum] = "a531ad91a1753f9dd2b74d56b519c52aebeac013373f76c6e4e6b19c66ca46a0"

S = "${WORKDIR}/rqt_nav_view-release-release-melodic-rqt_nav_view-0.5.7-0"

inherit catkin
