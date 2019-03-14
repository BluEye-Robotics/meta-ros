DESCRIPTION = "Model files of OpenNI device."
AUTHOR = "Isaac I.Y. Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf xacro"

RDEPENDS_${PN} = "urdf xacro"

SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/melodic/openni_description/1.11.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "504595e0ff6bcc4f0a11dc9e308f7d9e"
SRC_URI[sha256sum] = "709e253ea9d2ba4d1c81fe758da31e8359a8e00f4e0105405f37a6e68e011dc8"

ROS_SPN = "openni_camera"
S = "${WORKDIR}/openni_camera-release-release-melodic-openni_description-1.11.1-0"

inherit catkin
