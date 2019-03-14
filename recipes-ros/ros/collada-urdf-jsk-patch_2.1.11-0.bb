DESCRIPTION = "unaccepted patch for collada_urdf"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "collada-parser collada-urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib rostest cmake-modules mk libgts git python-catkin-tools collada-parser collada-urdf urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib libgts collada-urdf python-catkin-tools"

RDEPENDS_${PN} = "collada-parser collada-urdf urdf kdl-parser angles assimp-devel resource-retriever collada-dom roscpp geometric-shapes tf class-loader pluginlib libgts collada-urdf python-catkin-tools"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/collada_urdf_jsk_patch/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "de67460f7d900e02b414e36b5a146191"
SRC_URI[sha256sum] = "96f21834e4f40d960368a0c133af23d613603f69fbd2f3976195b45568aca585"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-collada_urdf_jsk_patch-2.1.11-0"

inherit catkin
