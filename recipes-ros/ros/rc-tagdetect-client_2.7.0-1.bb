DESCRIPTION = "The ros client for roboception tag detection modules"
AUTHOR = "Monika Florek-Jasinska"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation curl roscpp rcdiscover std-srvs geometry-msgs visualization-msgs rc-common-msgs tf tf2-geometry-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_tagdetect_client/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eed48db8e6e062dc6aa8a2662d323993"
SRC_URI[sha256sum] = "2b8f52147dfdc5dd47283901f12ca03810aa5dad60accbb5055e3f4c4d80cd3a"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_tagdetect_client-2.7.0-1"

inherit catkin
