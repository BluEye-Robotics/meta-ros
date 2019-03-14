DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical user interface provided by qt_gui."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui catkin qt-gui"

RDEPENDS_${PN} = "catkin qt-gui"

SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/melodic/rqt_gui/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b1523dd02c4097eb2068d21299de6766"
SRC_URI[sha256sum] = "d6a9306b14facf26f432b32e9946daa1aa3c10c6f6d053e3a701bfab10e3200a"

ROS_SPN = "rqt"
S = "${WORKDIR}/rqt-release-release-melodic-rqt_gui-0.5.0-0"

inherit catkin
