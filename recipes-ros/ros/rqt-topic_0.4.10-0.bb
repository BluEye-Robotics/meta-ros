DESCRIPTION = "rqt_topic provides a GUI plugin for displaying debug information about ROS topics including publishers, subscribers, publishing rate, and ROS Messages."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-rospkg python3-pyqt5 rostopic rqt-gui rqt-gui-py std-msgs"

RDEPENDS_${PN} = "python3-rospkg python3-pyqt5 rostopic rqt-gui rqt-gui-py std-msgs"

SRC_URI = "https://github.com/ros-gbp/rqt_topic-release/archive/release/melodic/rqt_topic/0.4.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8deaff8a8483ca8a3d993cccf9498fda"
SRC_URI[sha256sum] = "54ab2164334a2a0ef5774a8b684d8275425e807891d98129795292fa2d968b99"

S = "${WORKDIR}/rqt_topic-release-release-melodic-rqt_topic-0.4.10-0"

inherit catkin
