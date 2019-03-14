DESCRIPTION = "A plugin to image_transport for transparently sending images encoded with ImageZero."
AUTHOR = "P. J. Reed"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-transport imagezero-ros message-runtime sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/melodic/imagezero_image_transport/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c353fc9cc4e4184c1c740d63abe86182"
SRC_URI[sha256sum] = "4c9fbc7c319b30bb24174343cc8e901e9908725890f11cdca4866fbd4f4550ed"

ROS_SPN = "imagezero_transport"
S = "${WORKDIR}/imagezero_transport-release-release-melodic-imagezero_image_transport-0.2.4-0"

inherit catkin
