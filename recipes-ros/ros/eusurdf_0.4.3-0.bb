DESCRIPTION = "urdf models converted from euslisp"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "collada-urdf-jsk-patch gazebo-ros roseus rostest python-lxml collada-urdf-jsk-patch gazebo-ros python-lxml rostest"

RDEPENDS_${PN} = "collada-urdf-jsk-patch gazebo-ros python-lxml rostest"

SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/melodic/eusurdf/0.4.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "77efbe38d6d8eeba25c311dca77e3b07"
SRC_URI[sha256sum] = "47f6b8cfb42f9516ed0993922e6f3059cb387fa533cda56fed5e2fb81937f395"

ROS_SPN = "jsk_model_tools"
S = "${WORKDIR}/jsk_model_tools-release-release-melodic-eusurdf-0.4.3-0"

inherit catkin
