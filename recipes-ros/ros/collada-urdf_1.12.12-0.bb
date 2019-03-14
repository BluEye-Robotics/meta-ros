DESCRIPTION = "This package contains a tool to convert Unified Robot Description Format (URDF) documents into COLLAborative Design Activity (COLLADA) documents. Implements robot-specific COLLADA extensions as defined by http://openrave. programmingvision. com/index. php/Started:COLLADA"
AUTHOR = "Tim Field"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles assimp cmake-modules collada-dom collada-parser libeigen geometric-shapes urdfdom urdfdom-headers resource-retriever rosconsole urdf urdfdom-headers"

RDEPENDS_${PN} = "assimp collada-dom collada-parser geometric-shapes urdfdom resource-retriever rosconsole urdf"

SRC_URI = "https://github.com/ros-gbp/collada_urdf-release/archive/release/melodic/collada_urdf/1.12.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7fbac1a342c992d146a4eac0af8672d"
SRC_URI[sha256sum] = "b45310a279cd0ed77c4c782656bcaed2417adc74d09b546d4a41eb0121e616c1"

S = "${WORKDIR}/collada_urdf-release-release-melodic-collada_urdf-1.12.12-0"

inherit catkin
