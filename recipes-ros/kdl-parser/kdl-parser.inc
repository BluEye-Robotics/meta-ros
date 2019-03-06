SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9e963fe5463850e3c81bb4d88a37114d"
SRC_URI[sha256sum] = "51378b09efc288ad91870322930f032f31a82e4a436865222b9990470995f67a"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kdl_parser"
