DESCRIPTION = "Metapackage of rqt plugins that are particularly used with robots during its operation."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rqt-moveit rqt-nav-view rqt-pose-view rqt-robot-dashboard rqt-robot-monitor rqt-robot-steering rqt-runtime-monitor rqt-rviz rqt-tf-tree"

RDEPENDS_${PN} = "rqt-moveit rqt-nav-view rqt-pose-view rqt-robot-dashboard rqt-robot-monitor rqt-robot-steering rqt-runtime-monitor rqt-rviz rqt-tf-tree"

SRC_URI = "https://github.com/ros-gbp/rqt_robot_plugins-release/archive/release/melodic/rqt_robot_plugins/0.5.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ce70e69520d0cf5a7e6a6e7bfe703de"
SRC_URI[sha256sum] = "2fa30a70d1eed9ff4724c1b9d1ef8303066b373bae9abcbf2b8a715a89e515ba"

S = "${WORKDIR}/rqt_robot_plugins-release-release-melodic-rqt_robot_plugins-0.5.7-0"

inherit catkin
