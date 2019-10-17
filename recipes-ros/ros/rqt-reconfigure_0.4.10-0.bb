DESCRIPTION = "This rqt plugin succeeds former dynamic_reconfigure's GUI		(reconfigure_gui), and provides the way to view and edit the parameters		that are accessible via dynamic_reconfigure."
AUTHOR = "Isaac Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "dynamic-reconfigure python3-pyqt5 rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"

RDEPENDS_${PN} = "dynamic-reconfigure python3-pyqt5 rospy rqt-console rqt-gui rqt-gui-py rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_reconfigure-release/archive/release/melodic/rqt_reconfigure/0.4.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a2ead65c72b082038b91199375a84958"
SRC_URI[sha256sum] = "7dfe332ee9d603a0981832a698c817c14b0fa00c3cc0de4ab7a6676c90d598b4"

S = "${WORKDIR}/rqt_reconfigure-release-release-melodic-rqt_reconfigure-0.4.10-0"

inherit catkin
