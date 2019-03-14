DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics in representations other than raw pixel data. For example, for viewing a stream of images off-robot, a video codec will give much lower bandwidth and latency. For low frame rate tranport of high-definition images, you might prefer sending them as JPEG or PNG-compressed form."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "compressed-depth-image-transport compressed-image-transport theora-image-transport"

RDEPENDS_${PN} = "compressed-depth-image-transport compressed-image-transport theora-image-transport"

SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/melodic/image_transport_plugins/1.9.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "48eff7e9620d983b4432a3f0f8c999fc"
SRC_URI[sha256sum] = "1838bdad50e903b572a00fcb66935326e81c5e706af3356a64c0322927361ecd"

S = "${WORKDIR}/image_transport_plugins-release-release-melodic-image_transport_plugins-1.9.5-0"

inherit catkin
