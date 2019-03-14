DESCRIPTION = "rqt_gui_py enables GUI plugins to use the Python client library for ROS."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui rqt-gui rospy qt-gui rqt-gui rospy"

RDEPENDS_${PN} = "qt-gui rqt-gui rospy"

SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/melodic/rqt_gui_py/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c00f7a333d8b28a8de4c44f8d0f25d9e"
SRC_URI[sha256sum] = "0ff83fecf2965173c22e185ba5388c38645c281a5aa89dbe3baac46c431eece6"

ROS_SPN = "rqt"
S = "${WORKDIR}/rqt-release-release-melodic-rqt_gui_py-0.5.0-0"

inherit catkin
