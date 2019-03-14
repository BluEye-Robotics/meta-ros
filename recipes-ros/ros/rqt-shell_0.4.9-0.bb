DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-pyqt5 python-rospkg qt-gui qt-gui-py-common rqt-gui rqt-gui-py"

RDEPENDS_${PN} = "python-pyqt5 python-rospkg qt-gui qt-gui-py-common rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/rqt_shell-release/archive/release/melodic/rqt_shell/0.4.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b6a9b830d75c05e8d1bb8128bf497d3f"
SRC_URI[sha256sum] = "522e34ae2cf5e4af2d14805e70767f394ec88043033a1c6e44324ae58a139001"

S = "${WORKDIR}/rqt_shell-release-release-melodic-rqt_shell-0.4.9-0"

inherit catkin
