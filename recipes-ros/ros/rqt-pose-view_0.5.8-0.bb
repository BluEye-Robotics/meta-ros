DESCRIPTION = "rqt_pose_view provides a GUI plugin for visualizing 3D poses."
AUTHOR = "Dorian Scholz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs gl-dependency python-opengl python-pyqt5 python-rospkg rospy rostopic rqt-gui rqt-gui-py rqt-py-common tf"

RDEPENDS_${PN} = "geometry-msgs gl-dependency python-opengl python-pyqt5 python-rospkg rospy rostopic rqt-gui rqt-gui-py rqt-py-common tf"

SRC_URI = "https://github.com/ros-gbp/rqt_pose_view-release/archive/release/melodic/rqt_pose_view/0.5.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f0a3b526ff8475b1354318a6095def9d"
SRC_URI[sha256sum] = "00e9962e4a7132dcb9082692fb49563d309b9e446b5eb17e65354dd7e1e24e4d"

S = "${WORKDIR}/rqt_pose_view-release-release-melodic-rqt_pose_view-0.5.8-0"

inherit catkin
