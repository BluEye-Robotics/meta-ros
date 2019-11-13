DESCRIPTION = "The ros client for roboception grasp generation modules"
AUTHOR = "Monika Florek-Jasinska"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation curl roscpp rcdiscover std-srvs geometry-msgs shape-msgs visualization-msgs tf dynamic-reconfigure tf2-geometry-msgs rc-common-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_pick_client/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae9b91139703cd5fdbda32fc408e1e73"
SRC_URI[sha256sum] = "34fd5d1bedaded50d02cb0d18eca55fd321b2cf905101dc982402be3b908941e"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_pick_client-2.7.0-1"

inherit catkin
