DESCRIPTION = "rqt_service_caller provides a GUI plugin for calling arbitrary services."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg rosservice rqt-gui rqt-gui-py rqt-py-common"

RDEPENDS_${PN} = "python-rospkg rosservice rqt-gui rqt-gui-py rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_service_caller-release/archive/release/melodic/rqt_service_caller/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5069f0fb566cf6b6dc888f29eebd0043"
SRC_URI[sha256sum] = "574aa580c11737fc800b058f7cac63a7a7b75d144525d04e89c538716418c1b3"

S = "${WORKDIR}/rqt_service_caller-release-release-melodic-rqt_service_caller-0.4.8-0"

inherit catkin
