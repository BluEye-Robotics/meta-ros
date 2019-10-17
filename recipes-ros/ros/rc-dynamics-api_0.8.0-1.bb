DESCRIPTION = "The rc_dynamics_api provides an API for easy handling of the dynamic-state data streams provided by Roboception's stereo camera with self-localization. See http://rc-visard. com Dynamic-state estimates of the rc_visard relate to its self-localization and ego-motion estimation. These states refer to rc_visard's current pose, velocity, or acceleration and are published on demand via several data streams. For a complete list and descriptions of these dynamics states and the respective data streams please refer to rc_visard's user manual."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "protobuf-dev curl catkin"

RDEPENDS_${PN} = "protobuf"

SRC_URI = "https://github.com/roboception-gbp/rc_dynamics_api-release/archive/release/melodic/rc_dynamics_api/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "63819b80361ea86a6913f6006762262e"
SRC_URI[sha256sum] = "8e3d2bcda9263dbe5672670e9aba9fbca85f2ca91ec9d8bf72c51993ee97bbe8"

S = "${WORKDIR}/rc_dynamics_api-release-release-melodic-rc_dynamics_api-0.8.0-1"

inherit catkin
