DESCRIPTION = "This rqt plugin succeeds former dynamic_reconfigure's GUI (reconfigure_gui), and provides the way to view and edit the parameters that are accessible via dynamic_reconfigure."
AUTHOR = "Isaac Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint"

RDEPENDS_${PN} = "dynamic-reconfigure python-pyqt5 python-pyyaml rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_reconfigure-release/archive/release/melodic/rqt_reconfigure/0.5.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0370346a379ad3975df44a86f5318e14"
SRC_URI[sha256sum] = "718a1e266ce3af19b94bed5cf51f94df71be44070213e63940c57c1a908218f8"

S = "${WORKDIR}/rqt_reconfigure-release-release-melodic-rqt_reconfigure-0.5.1-1"

inherit catkin
