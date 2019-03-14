DESCRIPTION = "The rc_dynamics_api provides an API for easy handling of the dynamic-state data streams provided by Roboception's stereo camera with self-localization. See http://rc-visard. com Dynamic-state estimates of the rc_visard relate to its self-localization and ego-motion estimation. These states refer to rc_visard's current pose, velocity, or acceleration and are published on demand via several data streams. For a complete list and descriptions of these dynamics states and the respective data streams please refer to rc_visard's user manual."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "protobuf-dev curl catkin"

RDEPENDS_${PN} = "protobuf"

SRC_URI = "https://github.com/roboception-gbp/rc_dynamics_api-release/archive/release/melodic/rc_dynamics_api/0.7.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6b6ceab87baa7ead37c0e9f4c4573088"
SRC_URI[sha256sum] = "5d865c30cd327b025024612b430e223e073cc182a7d8cb5c46b2612348982bbf"

S = "${WORKDIR}/rc_dynamics_api-release-release-melodic-rc_dynamics_api-0.7.1-0"

inherit catkin
