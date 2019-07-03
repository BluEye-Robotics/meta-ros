DESCRIPTION = "unaccepted patch for collada_urdf"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "collada-parser collada-urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib rostest cmake-modules mk libgts git python-catkin-tools collada-parser collada-urdf urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib libgts collada-urdf python-catkin-tools"

RDEPENDS_${PN} = "collada-parser collada-urdf urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib libgts collada-urdf python-catkin-tools"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/collada_urdf_jsk_patch/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3692ceb6c0bb3d8a5c8e5996cfc77d03"
SRC_URI[sha256sum] = "a85b0bd5b332dbf84cd7cfc577ea410f331c9cb106f677cc93453eeb99e3e472"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-collada_urdf_jsk_patch-2.1.12-2"

inherit catkin
