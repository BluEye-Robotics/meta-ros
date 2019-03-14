DESCRIPTION = "The urdf_sim_tutorial package"
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-manager diff-drive-controller gazebo-ros gazebo-ros-control joint-state-controller position-controllers robot-state-publisher rqt-robot-steering  urdf-tutorial xacro"

RDEPENDS_${PN} = "controller-manager diff-drive-controller gazebo-ros gazebo-ros-control joint-state-controller position-controllers robot-state-publisher rqt-robot-steering  urdf-tutorial xacro"

SRC_URI = "https://github.com/ros-gbp/urdf_sim_tutorial-release/archive/release/melodic/urdf_sim_tutorial/0.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0949eeb205339e9e074ce927511da244"
SRC_URI[sha256sum] = "520f94f7fe52250069283fc7bdd40b734e9153bdcc11b76309fe9522972d8f77"

S = "${WORKDIR}/urdf_sim_tutorial-release-release-melodic-urdf_sim_tutorial-0.4.0-0"

inherit catkin
