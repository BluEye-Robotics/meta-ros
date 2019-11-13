DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost libeigen eigen-stl-containers fcl geometric-shapes geometry-msgs kdl-parser console-bridge urdf urdfdom urdfdom-headers moveit-msgs octomap octomap-msgs random-numbers roslib rostime rosconsole sensor-msgs shape-msgs srdfdom std-msgs tf2-eigen tf2-geometry-msgs trajectory-msgs visualization-msgs xmlrpcpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_core/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "71c9a79f15462be56b06c99ed9732253"
SRC_URI[sha256sum] = "59ab8b109ba3d55436bce51239fa3e80f1e4e0d6cba1ddbb9aa827d9083a367a"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_core-1.0.2-1"

inherit catkin
