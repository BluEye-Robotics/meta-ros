DESCRIPTION = "qt_gui_py_common provides common functionality for GUI plugins written in Python."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python3-pyqt5 python3-rospkg python3-rospkg"

SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_py_common/0.3.14-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "16e4ef3513528650fa44c5ac47c15592"
SRC_URI[sha256sum] = "524b32b7e0b0aecc534a79a215045f8592474c19eecbc4f0c8f4650ce8aa133b"

ROS_SPN = "qt_gui_core"
S = "${WORKDIR}/qt_gui_core-release-release-melodic-qt_gui_py_common-0.3.14-2"

inherit catkin
