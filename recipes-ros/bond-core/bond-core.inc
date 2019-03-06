SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f20d34196660ab6920bcb383a6cc0434"
SRC_URI[sha256sum] = "9f2bd791abc0356f47235db7e2b042479e6a091cf2cd969d0918a8e0c76b632d"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "bond_core"

SRC_URI += "file://0001-Argument-to-Boost-Milliseconds-must-be-integral-in-B.patch;patchdir=.."
